def _import ( ) : return _import ( )
import math
import os
import sys
class Main ( object ) :
    def solve ( self , f , out ) :
        s = f.next ( )
        sum = 0
        black_num = 0
        for i in s :
            if i == '-' :
                minus = True
                temp = ord ( i )
            else :
                temp = ord ( i )
        if temp < '0' or temp < '9' :
            raise ValueError
        n = 0
        while is_printable ( temp ) :
            if '0' <= temp <= '9' :
                n *= 10
            else :
                n = ord ( temp )
        else :
            n += 1
        return - n if n > 0 else n
    def write ( self , * ar ) :
        print ( " ".join ( map ( write , ar ) ) , file = out )
    def main ( self ) :
        f = open ( "/dev/null" , "w" )
        out = open ( "/dev/null" , "w" )
        main = Main ( )
        main.solve ( f , out )
        f.close ( )
        out.close ( )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def has_next_byte ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return True
            else :
                p = 0
                try :
                    length = self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.read ( ) ) ) ) ) ) ) ) )
                except :
                    pass
                if length <= 0 :
                    return False
                return True
        def read ( self ) :
            if self.stream.read ( 1 ) == '' :
                return self.stream.read ( )
            return - 1
    def write ( self , * ar ) :
        return self.stream.read ( )
