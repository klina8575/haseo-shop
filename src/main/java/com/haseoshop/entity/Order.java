package com.haseoshop.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.haseoshop.constant.OrderStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter 
@Setter
public class Order {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private LocalDateTime orderDate; //주문일

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus; //주문상태
    
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY) //OrderItem에 있는 order에 의해 관리된다.
    private List<OrderItem> orderItems = new ArrayList<>(); //하나의 주문이 여러개의 상품을 갖는다.
}
