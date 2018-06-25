package com.vidroid.com.br.apps.event.fragments.map


import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
/*import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions*/
import com.vidroid.com.br.apps.event.MainActivity

import com.vidroid.com.br.apps.event.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class MapFragment : androidx.fragment.app.Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_map, container, false)

        val webView = view.findViewById<WebView>(R.id.webViewMap)
        val webSettings = webView.settings

        webSettings.javaScriptEnabled = true
        webSettings.allowContentAccess = true
        webSettings.allowFileAccess = true

        val inframe : String = "<html><body><iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3020.7066575181348!2d-49.27038140623926!3d-25.439680745156195!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94dce465f9b0c855%3A0xda22d429219f2f12!2sUTFPR+C%C3%A2mpus+Curitiba!5e0!3m2!1sen!2sbr!4v1529897844224\" width=\"100%\" height=\"100%\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe></body></html>"
        //val inframe : String = "<html><body>You scored <b>192</b> points.</body></html>"
        webView.loadData(inframe, "text/html", null)
        //webView.loadUrl("https://goo.gl/maps/w2mMutn2qnK2")
        webView.webViewClient = WebViewClient()


        return view
    }

}
