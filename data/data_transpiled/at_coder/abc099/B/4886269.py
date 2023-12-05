def import _main
import sys
import os
class Main ( object ) :
    def retrunk_n ( self , n ) :
        i = 0
        sum = 0
        while i <= n :
            sum += i
            i += 1
        return sum
    def main ( args ) :
        with open ( "../" , "r" ) as sc :
            At = Main ( )
            a = sc.read ( )
            b = sc.read ( )
            result = 0
            result = At.retrunk_n ( b - a ) - b
            print ( result )
