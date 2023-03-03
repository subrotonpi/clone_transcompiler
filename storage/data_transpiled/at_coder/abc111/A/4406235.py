def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        try :
            sc = sys.stdin
        except :
            print ( 'out' )
            return
        n = int ( sc.read ( ) )
        if n == 111 :
            print ( 999 )
        elif n == 119 :
            print ( 991 )
        elif n == 191 :
            print ( 919 )
        elif n == 199 :
            print ( 911 )
        elif n == 911 :
            print ( 199 )
        elif n == 919 :
            print ( 191 )
        elif n == 991 :
            print ( 119 )
        elif n == 999 :
            print ( 111 )
