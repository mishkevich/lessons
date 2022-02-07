package by.mishkevich.my_restaurant.entity;


import by.mishkevich.my_restaurant.entity.enums.Method;
import by.mishkevich.my_restaurant.entity.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long id;

    @Column(name = "time")
    private LocalDateTime time;

    @Enumerated (EnumType.STRING)
    @Column(name = "method")
    private Method method;

    @Column(name = "total_sum_for_pay")
    private Double totalSumForPay;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_status")
    private PaymentStatus paymentStatus;

    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id")
    private Order orderPayment;

}
