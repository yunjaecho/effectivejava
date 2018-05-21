package com.yunjae.effective.serialization;

import java.io.*;
import java.util.Base64;

public class Client {
    String base64Member;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Client client = new Client();
        // 직렬화
        client.serialized();
        // 역직렬화
        client.deSerialized();
    }

    private void serialized() throws IOException {
        Member member = new Member("김배민", "deliverykim@baemin.com", 25);
        byte[] serializedMember;

        //객체를 직렬 화하여 바이트 배열(byte []) 형태로 변환하였습니다.
        try(ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try(ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                oos.writeObject(member);
                // serialized Member -> 직렬화된 member 객체
                serializedMember = baos.toByteArray();
            }
        }

        // 바이트 배열로 생성된 직렬화 데이터를 base64로 변화
        System.out.println(Base64.getEncoder().encodeToString(serializedMember));
        base64Member =  Base64.getEncoder().encodeToString(serializedMember);
    }

    private void deSerialized() throws IOException, ClassNotFoundException {
        byte[] serializedMember = Base64.getDecoder().decode(base64Member);
        try(ByteArrayInputStream bais = new ByteArrayInputStream(serializedMember)) {
            try(ObjectInputStream ois = new ObjectInputStream(bais)) {
                // 역직렬화된 Member 객체를 읽어온다
                Object objectMember = ois.readObject();
                Member member = (Member) objectMember;
                System.out.println(member);
            }
        }
    }




}
