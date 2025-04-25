package com.itm.ecosurprise.classes;

import com.itm.ecosurprise.enums.EstadoOrden;
import com.itm.ecosurprise.interfaces.EstadoOrdenState;
import com.itm.ecosurprise.models.Orden;

public class EstadoPendiente implements EstadoOrdenState {
    @Override
    public void confirmar(Orden orden) {
        orden.setEstadoOrden(EstadoOrden.comfirmada.name());
    }

    @Override
    public void cancelar(Orden orden) {
        orden.setEstadoOrden(EstadoOrden.cancelada.name());
    }

    @Override
    public void reembolsar(Orden orden) {
        throw new UnsupportedOperationException("No se puede reembolsar una orden pendiente.");
    }
}

