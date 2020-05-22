package com.example.pathfollower.network

import com.example.pathfollower.simulator.WebSocket
import com.example.pathfollower.simulator.WebSocketListener

class NetworkService {

    fun createWebSocket(webSocketListener: WebSocketListener): WebSocket {
        return WebSocket(webSocketListener)
    }

}