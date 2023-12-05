def _import ( ) : return _import ( "" )
import sys
import os
import sys
import function
class Main ( object ) :
    S , T = next ( ) , next ( )
    sum_s = [ ]
    sum_t = [ ]
    def solve ( ) :
        S = next ( )
        T = next ( )
        for c in S :
            if not ( '0' <= c <= '9' ) : raise
            num = - num if num else num
        return S
    def read ( ) :
        while not is_alnum ( ) :
            pass
        build = [ ]
        while is_alnum ( ) :
            build.append ( ord ( c ) )
        return ''.join ( build )
    def read ( ) :
        while is_alnum ( ) :
            pass
        return ''.join ( build )
    def write ( ) :
        while is_alnum ( ) :
            pass
        return ''.join ( build )
    def read ( ) :
        while is_alnum ( ) :
            pass
        return ''.join ( build )
    def write ( ) :
        while is_alnum ( ) :
            pass
        return ''.join ( write ( ) )
    def read ( ) :
        while is_alnum ( ) :
            pass
        return ''.join ( write ( ) )
    def write ( ) :
        for a , b , c in zip ( range ( 1 , 10 ) , range ( 1 , 10 ) ) :
            sa = sum_s [ b ] - sum_s [ a ]
            sb = b - a - sa
            sa %= 3
            sb %= 3
            ta = sum_t [ d ] - sum_t [ c ]
            tb = d - c - ta
            ta %= 3
            tb %= 3
            if sa == ta and sb == tb :
                write ( "YES" )
            elif ( sa + 1 ) % 3 == ta and ( sb + 1 ) % 3 == tb :
                write ( "YES" )
            elif ( sa + 2 ) % 3 == ta and ( sb + 2 ) % 3 == tb :
                write ( "YES" )
            else :
                write ( "NO" )
        return ''.join ( write )
        