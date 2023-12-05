def import import sys
import os
import sys
import csv
import csv
import math
import math
import os
import sys
import sys
import sys
class Barber ( sys.stdin ) :
    def __init__ ( self ) :
        sys.stdin = open ( 'barber.in' )
        sys.stdout = csv.writer ( sys.stdout )
        self.__stdout__ = csv.writer ( sys.stdout )
        self.__stdout__ = csv.writer ( sys.stdout )
        self.__stdout__ = csv.writer ( sys.stdout )
        self.__q = int ( self.__stdout__.readline ( ) )
        for i in range ( 1 , self.__q + 1 ) :
            s = self.__buf.readline ( ).split ( )
            b = int ( s [ 0 ] )
            n = int ( s [ 1 ] )
            time = self.__buf.readline ( ).split ( )
            rate = 0
            for j in range ( b ) :
                rate = rate + 1./ float ( time [ j ] )
            r = self.__n - b
            l = round ( r / rate )
            h = l + 100000
            while True :
                m = ( l + h ) / 2
                cuts = 0
                exact = 0
                for j in range ( b ) :
                    cuts = cuts + m / int ( time [ j ] )
                    if m % int ( time [ j ] ) == 0 :
                        exact += 1
                if cuts >= r and cuts - exact < r :
                    break
                if cuts >= r :
                    h = m
                elif cuts - exact < r :
                    l = m
                else :
                    print ( "Hello" )
            t = ( l + h ) / 2
            total = 0
            for j in range ( b ) :
                total = total + ( t - 1 ) / int ( time [ j ] )
            rem = r - total
            for j in range ( b ) :
                if t % int ( time [ j ] ) == 0 :
                    rem -= 1
                    if rem == 0 :
                        sys.stdout.write ( "Case #%d: %d\n" % ( i , j + 1 ) )
                        break
    sys.stdout