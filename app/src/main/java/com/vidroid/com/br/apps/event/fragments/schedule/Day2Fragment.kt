package com.vidroid.com.br.apps.event.fragments.schedule


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.vidroid.com.br.apps.event.R
import com.vidroid.com.br.apps.event.model.Event
import com.vidroid.com.br.apps.organizze.pro.adapter.AdapterEvents

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Day2Fragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_day2, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = AdapterEvents(getEvents())

        val layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(view.context)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter






        return view
    }

    private fun getEvents() : List<Event>{

        var eventList : MutableList<Event> = mutableListOf()
        var event = Event("", "", "")

        //Event 0
        event = Event("9h", "Aplicação de Arduíno em displays gráficos", "Set 27 / Miniauditório / 45 min")
        eventList.add(event)

        //Event 1
        event = Event("9h", "da UTFPR para a Alemanha. Und dann...?", "Set 27 / Auditório / 45 min")
        eventList.add(event)

        //Event 2
        event = Event("10h", "Big Data e Analytics.", "Set 27 / Miniauditório / 45 min")
        eventList.add(event)

        //Event 3
        event = Event("10h", "Empreendedorismo na área da Tecnologia", "Set 27 / Auditório / 45 min")
        eventList.add(event)

        //Event 4
        event = Event("11h", "GPON", "Set 27 / Miniauditório / 45 min")
        eventList.add(event)

        //Event 5
        event = Event("11h", "Processo de Desenvolvimento de Games de Estratégia", "Set 27 / Auditório / 45 min")
        eventList.add(event)

        //Event 6
        event = Event("14h", "Biometria - A Última Barreira de Segurança", "Set 27 / Miniauditório / 45 min")
        eventList.add(event)

        //Event 7
        event = Event("14h", "Inovação Coorporativa", "Set 27 / Auditório / 45 min")
        eventList.add(event)

        //Event 8
        event = Event("15h", "Linguagem de programação Elixir", "Set 27 / Miniauditório / 45 min")
        eventList.add(event)

        //Event 9
        event = Event("15h", "Aspectos jurídicos da segurança da informação", "Set 27 / Auditório / 45 min")
        eventList.add(event)

        //Event 10
        event = Event("16h", "Bacharelado Sistema de Informação", "Set 27 / Miniauditório / 45 min")
        eventList.add(event)

        //Event 11
        event = Event("16h", "Renault Veículo Elétrico", "Set 27 / Auditório / 45 min")
        eventList.add(event)

        //Event 12
        event = Event("18h", "Cine PETECO - PETECO", "Set 27 / Miniuditório / 45 min")
        eventList.add(event)

        //Event 13
        event = Event("19h", "Afinal, o que vai dentro de um iPhone?", "Set 27 / Miniauditório / 45 min")
        eventList.add(event)

        //Event 14
        event = Event("20h", "Machine Learning e Deep Learning", "Set 27 / Miniauditório / 45 min")
        eventList.add(event)

        //Event 15
        event = Event("21h", "Veículo Conectado", "Set 27 / Miniauditório / 45 min")
        eventList.add(event)

        /*
        //Event 16
        event = Event("", "", "")
        eventList.add(event)

        //Event 17
        event = Event("", "", "")
        eventList.add(event)

        //Event 18
        event = Event("", "", "")
        eventList.add(event)

        //Event 19
        event = Event("", "", "")
        eventList.add(event)

        //Event 20
        event = Event("", "", "")
        eventList.add(event)

        //Event 21
        event = Event("", "", "")
        eventList.add(event)

        //Event 22
        event = Event("", "", "")
        eventList.add(event)

        //Event 23
        event = Event("", "", "")
        eventList.add(event)

        //Event 24
        event = Event("", "", "")
        eventList.add(event)

        //Event 25
        event = Event("", "", "")
        eventList.add(event)

        //Event 26
        event = Event("", "", "")
        eventList.add(event)

        //Event 27
        event = Event("", "", "")
        eventList.add(event)

        //Event 28
        event = Event("", "", "")
        eventList.add(event)

        //Event 29
        event = Event("", "", "")
        eventList.add(event)

        //Event 30
        event = Event("", "", "")
        eventList.add(event)

        //Event 31
        event = Event("", "", "")
        eventList.add(event)

        //Event 32
        event = Event("", "", "")
        eventList.add(event)

        //Event 33
        event = Event("", "", "")
        eventList.add(event)

        //Event 34
        event = Event("", "", "")
        eventList.add(event)

        //Event 35
        event = Event("", "", "")
        eventList.add(event)

        //Event 36
        event = Event("", "", "")
        eventList.add(event)

        //Event 37
        event = Event("", "", "")
        eventList.add(event)

        //Event 38
        event = Event("", "", "")
        eventList.add(event)

        //Event 39
        event = Event("", "", "")
        eventList.add(event)

        //Event 40
        event = Event("", "", "")
        eventList.add(event)

        //Event 41
        event = Event("", "", "")
        eventList.add(event)

        //Event 42
        event = Event("", "", "")
        eventList.add(event)

        //Event 43
        event = Event("", "", "")
        eventList.add(event)

        //Event 44
        event = Event("", "", "")
        eventList.add(event)

        //Event 45
        event = Event("", "", "")
        eventList.add(event)

        //Event 46
        event = Event("", "", "")
        eventList.add(event)

        //Event 47
        event = Event("", "", "")
        eventList.add(event)

        //Event 48
        event = Event("", "", "")
        eventList.add(event)

        //Event 49
        event = Event("", "", "")
        eventList.add(event)

        //Event 50
        event = Event("", "", "")
        eventList.add(event)*/


        val eventListReadOnly : List<Event> = eventList

        return eventListReadOnly

    }


}
