def import _readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = MyScanner ( )
        a = sc.__next__ ( )
        print ( 'Perfect' if a == 100 else 'Great' if a >= 90 else 'Good' if a >= 60 else 'Bad' )
    def l_min ( a ) :
        [ a ] = a
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        [ a ] = a [ - 1 ]
        return a [ l - 1 ]
    def write ( self , out ) :
        if out == '' :
            out = ''
        else :
            out = out.write
    def readline ( self ) :
        while not out or not out :
            try :
                out = [ x for x in out if x != '' ]
            except IndexError :
                pass
        return out
    def __next__ ( self ) :
        while not out or not out :
            try :
                out = [ x for x in out if x != '' ]
            except IndexError :
                pass
        return out
    def __next__ ( self ) :
        return int ( __next__ ( self ) )
    def __next__ ( self ) :
        return long ( __next__ ( self ) )
    def __next__ ( self ) :
        return float ( __next__ ( self ) )
    def __next__ ( self ) :
        data = ''
        try :
            data = next ( self )
        except StopIteration :
            pass
        return data
return Main
