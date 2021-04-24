package com.ajeng.uts_19092002.activity.data_barang.presenter

import com.ajeng.uts_19092002.model.Barang

interface DataBarangView {
    fun onSuccessDataBarang(data: List<Barang?>?)
    fun onErrorDataBarang(msg: String?)

    fun onSuccessDeleteBarang(msg : String?)
    fun onErrorDeleteBarang(msg : String?)
}