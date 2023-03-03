def import import _number , get , get , value , sums
import sys
import os
class Main ( object ) :
    MOD = 1000000007
    def __init__ ( self ) :
        self.MOD = 1000000007
    def __init__ ( self ) :
        self.f = open ( "/proc/self/stat" )
        firstline = self.f.readline ( ).split ( )
        h = int ( firstline [ 0 ] )
        w = int ( firstline [ 1 ] )
        self.field = [ ]
        self.sums = [ ]
        for line in self.f :
            for i in range ( h ) :
                line = line.split ( )
                for j in range ( w ) :
                    self.field.append ( [ int ( i ) , j ] )
                    self.sums [ i ].append ( - 1 )
        count = 0
        for i in range ( h ) :
            for j in range ( w ) :
                if self.sums [ i ] [ j ] == - 1 :
                    get ( i , j , - 1 )
                count += self.sums [ i ] [ j ]
                count %= MOD
        print ( count )
    def get ( self , y , x , value ) :
        if y < 0 or y >= h or x < 0 or x >= w :
            return 0
        if self.field [ y ] [ x ] <= value :
            return 0
        if self.sums [ y ] [ x ] != - 1 :
            return sums [ y ] [ x ]
        ans = get ( self.y - 1 , x , self.field [ y ] [ x ] )
        ans %= MOD
        ans += get ( self.y , x - 1 , self.field [ y ] [ x ] )
        ans %= MOD
        ans += get ( self.y + 1 , x , self.field [ y ] [ x ] )
        ans %= MOD
        ans += get ( self.y , x + 1 , self.field [ y ] [ x ] ) + 1
        ans %= MOD
        self.sums [ y ] [ x ] = ans
        return ans
