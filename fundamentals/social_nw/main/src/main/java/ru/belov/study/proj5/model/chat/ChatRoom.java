package ru.belov.study.proj5.model.chat;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by john on 7/22/2016.
 * @author andrei.belov aka john
 * @link http://vk.com/andrei.belov
 */
@Data
@Entity
public class ChatRoom implements Serializable {

    // Constants ----------------------------------------------------------------------------------
    @Version
    private static final long serialVersionUID = 1L;

    // Properties ---------------------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
}
