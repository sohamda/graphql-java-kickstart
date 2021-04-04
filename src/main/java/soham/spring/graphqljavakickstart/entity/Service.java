package soham.spring.graphqljavakickstart.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="service")
public class Service {

    @Id
    private Integer id;
    private String name;
    private String description;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "provider_id")
    private Provider provider;

}
