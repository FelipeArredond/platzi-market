package com.springplatzi.springplatzi.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long id;
    private String estado;
    private String descripcion;
    @OneToMany(mappedBy = "categoria")
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private List<Producto> productos;
}
