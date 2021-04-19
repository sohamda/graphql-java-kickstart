package soham.spring.graphqljavakickstart.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name="service")
public class Service {

    @Id
    private Integer id;
    private String name;
    private String description;

    @Column(name = "provider_id")
    private Integer providerId;

}
