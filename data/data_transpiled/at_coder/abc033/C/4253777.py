def import import sys
import string
import re
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.compile ( sys.stdin.read ( ) )
        s = sc.readline ( )
        s = s.split ( '[+]' , 0 )
        count = 0
        for i in s :
            if '0' not in i :
                count += 1
        print ( count )
