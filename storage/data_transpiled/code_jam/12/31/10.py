def _import ( ) : return
import os
import sys
import locale
import os
import sys
import locale
import os
import string
class Solution ( object ) :
    def __init__ ( self ) :
        self._exit = 1
    def __init__ ( self , filename ) :
        try :
            self._file = open ( filename + ".in" , "r" )
            self._file = open ( filename + ".out" , "w" )
        except IOError :
            self._file = open ( filename + ".out" , "w" )
    def solve ( self , g ) :
        n = len ( self._file )
        m = ( len ( self._file ) + 31 ) // 32
        a = [ ]
        was = [ ]
        for i in range ( n ) :
            if self.go ( i , g , was , a ) :
                return YES
        return NO
    def go ( self , u , g , was , a ) :
        if was [ u ] :
            return False
        for i in range ( len ( self._file [ u ] ) ) :
            v = self._file [ u ] [ i ]
            if self.go ( v , g , was , a ) :
                return True
            for j in range ( len ( self._file [ u ] ) ) :
                if self._file [ u ] [ j ] & self._file [ v ] [ j ] :
                    return True
                self._file [ u ] [ j ] |= self._file [ v ] [ j ]
        dd = u // 32
        rr = u % 32
        a [ u ] [ dd ] |= ( 1 << rr )
        was [ u ] = True
        return False
    def solve ( self ) :
        t = randint ( 1 , 32 )
        for test in range ( 1 , t + 1 ) :
            n = randint ( 1 , 32 )
            g = [ ]
            for i in range ( n ) :
                m = randint ( 1 , 32 )
                g.append ( [ i , j ] )
            answer = solve ( g )
            self._file [ u ] [ v ] = answer
        return answer
