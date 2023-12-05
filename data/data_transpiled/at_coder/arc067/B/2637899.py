def import _readline
import readline
import readline
import sys
import readline
import readline
import time
class Main ( readline ) :
    def run ( self ) :
        sc = readline.readline ( )
        n , a , b = sc.split ( )
        ans = 0
        prev_x = sc.__next__ ( )
        for i in range ( 1 , n ) :
            x = sc.__next__ ( )
            if long ( a ) * ( x - prev_x ) < b :
                ans += long ( a ) * ( x - prev_x )
            else :
                ans += b
            prev_x = x
        print ( ans )
class Fastreadline ( ) :
    def readline ( self ) :
        while not readline.empty or not readline.empty :
            try :
                readline.next = raw_input
            except StopIteration :
                pass
        return readline ( self )
    def readline ( self ) :
        while not readline.empty or not readline.empty :
            try :
                readline.next = raw_input
            except StopIteration :
                pass
        return readline ( self )
