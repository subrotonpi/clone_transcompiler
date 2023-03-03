def _import ( ) : return int ( nextToken )
import random
import sys
import os
class A ( object ) :
    def solve ( self ) :
        x_won , o_won = False , False
        state = [ ]
        has_free = False
        for i in range ( 4 ) :
            try :
                line = open ( '%s.in' % name ).readline ( )
                if not line : return None
                St = [ ]
            except :
                NOO ( )
        def main ( self ) :
            with open ( '%s.out' % name ) as f :
                for j in range ( 4 ) :
                    has_free |= state [ j ] == '.'
    def solve ( self ) :
        with open ( '%s.in' % name ) as f :
            with open ( '%s.out' % name , 'w' ) as f :
                f.write ( '' )
    def main ( self ) :
        with open ( '%s.out' % name ) as f :
            with open ( '%s.out' % name , 'w' ) as f :
                f.write ( '' )
    for c in [ 'X' , 'O' ] :
        win = False
        for i in range ( 4 ) :
            eq = True
            for j in range ( 4 ) :
                eq &= _import ( state [ i ] , c )
            win |= eq
        for dir in range ( 2 ) :
            eq = True
            for i in range ( 4 ) :
                eq &= _import ( state [ dir * i + ( 1 - dir ) * ( 3 - i ) ] , c )
            win |= eq
        if c == 'X' :
            x_won = win
        else :
            o_won = win
    if x_won :
        if o_won :
            raise SystemExit
        print ( 'X won' , file = sys.stderr )
    elif o_won :
        print ( 'O won' , file = sys.stderr )
    elif has_free :
        print ( 'Game has not completed' , file = sys.stderr )
    else :
        print ( '