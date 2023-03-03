def import time
import sys
class LastHit ( object ) :
    def __init__ ( self ) :
        self.p , self.q , self.n = sys.stdin.readline ( ).split ( '\n' )
        self.h , self.g = [ ] , [ ]
        for i in range ( self.n ) :
            self.h.append ( self.h [ i ] )
            self.g.append ( self.g [ i ] )
        self.max_left = 10 * self.n + 1
        dp = [ ]
        INF = int ( self.inf )
        for i in dp :
            i.append ( INF )
        self.dp [ 0 ] [ 1 ] = 0
        best = INF
        for i in range ( self.n ) :
            need_town = ( self.h [ i ] + self.q - 1 ) / self.q
            for j in range ( 0 , self.max_left ) :
                if self.dp [ i ] [ j ] == INF :
                    continue
                self.dp [ i + 1 ] [ j + need_town ] = max ( self.dp [ i + 1 ] [ j + need_town ] , self.dp [ i ] [ j ] )
                rmn_hp = self.h [ i ] - ( self.q - 1 ) * self.q
                shots = ( rmn_hp + self.p - 1 ) / self.p
                new_shots = self.j + self.need_town - 1 - shots
                if new_shots < 0 :
                    continue
                self.dp [ i + 1 ] [ new_shots ] = max ( self.dp [ i + 1 ] [ new_shots ] , self.dp [ i ] [ j ] + g [ i ] )
        for i in range ( 0 , self.n ) :
            for j in range ( 0 , self.max_left ) :
                best = max ( best , self.dp [ i ] [ j ] )
        self.dp [ best ] = 0
    def run ( self ) :
        try :
            self.inp , self.out = sys.stdin.readline ( ).split ( '\n' )
            self.T = time.time ( )
            for i in range ( 1 , self.T + 1 )