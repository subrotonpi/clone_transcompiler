def _import ( ) : return True
import sys
import os
class Main ( ) :
    def solve ( ) :
        dfs ( randint ( 0 , len ( '' ) ) , [ '' ] )
    def dfs ( n , lines ) :
        if n == 0 :
            print ( lines )
            return
        dfs ( n - 1 , [ 'a' ] )
        dfs ( n - 1 , [ 'b' ] )
        dfs ( n - 1 , [ 'c' ] )
    def __next__ ( ) :
        ar = [ ]
        for i in range ( n ) :
            ar.append ( randint ( 0 , len ( '' ) ) )
        return ar
    def __next__ ( ) :
        if not next ( ) :
            raise StopIteration
        temp = read_byte ( )
        while is_printable ( temp ) :
            if '0' <= temp <= '9' :
                n *= 10
                n += temp - '0'
            else :
                raise StopIteration
            temp = read_byte ( )
            while is_printable ( temp ) :
                yield temp
                temp = read_byte ( )
            return temp
    def __next__ ( ) :
        return random.randint ( 0 , len ( '' ) )
    def __next__ ( ) :
        if not next ( ) :
            raise StopIteration
        lines = [ ]
        while is_printable ( lines [ - 1 ] ) :
            yield lines [ - 1 ]
        return lines
    def __next__ ( ) :
        return random.randint ( 0 , len ( '' ) )
    def __next__ ( ) :
        return random.randint ( 0 , len ( '' ) )
    def __next__ ( ) :
        if not next ( ) :
            raise StopIteration
        lines = [ ]
        while is_printable ( lines [ - 1 ] ) :
            yield lines [ - 1 ]
        return lines
    def __next__ ( ) :
        return random.randint ( 0 , len ( '' ) )
    def __next__ ( ) :
        return random.randint ( 0 , len ( '' ) )
    def __next__ ( ) :
        return __next__
class Main ( ) :
    def __init__ ( )
