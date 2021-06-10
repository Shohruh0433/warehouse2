package uz.developers.appwarehouse.entity.warehouseEntity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.developers.appwarehouse.entity.extendesClasses.AbsClass;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
public class Warehouse extends AbsClass {

}
