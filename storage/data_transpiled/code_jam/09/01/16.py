def import _import_py2exe_file
import os
import sys
class A2 ( object ) :
    def __init__ ( self ) :
        f = open ( 'testin' , 'r' )
        f = open ( 'testoutA' , 'w' )
        self.__dict__ = f.readlines ( )
        L , D , N = ( int ( i ) for i in self.__dict__ [ 'L' ].split ( ) )
        self.__dict__ = [ i.strip ( ) for i in self.__dict__ [ 'D' ].split ( ) ]
    def run ( self ) :
        f.close ( )
        return f
    for case in range ( 1 , N + 1 ) :
        s = sys.stdin.readline ( )
        ss = [ ]
        for i in range ( len ( s ) ) :
            j = i + 1
            if s [ i ] == '(' :
                tok = ''
                for _ in range ( j ) :
                    tok += s [ j ]
                ss.append ( tok )
                i = j
            else :
                ss.append ( '%s' % s [ i ] )
        ans = 0
        for d in self.__dict__ [ 'D' ] :
            ok = True
            for i in range ( len ( d ) ) and ok :
                if '%s' % d [ i ] not in ss [ i ] :
                    ok = False
            if ok :
                ans += 1
        out = 'Case #%d: %d' % ( cases , ans )
        print ( out )
        f.write ( out + '\n' )
    f.flush ( )
    f.close ( )
