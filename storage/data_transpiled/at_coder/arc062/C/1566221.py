def _main ( * args ) : return
import os
import sys
import os
import os
import sys
import time
import random
class Main ( object ) :
    def __init__ ( self , hash , cs ) :
        self.ret = sum ( )
        for i in range ( len ( cs ) ) :
            hash = 0
            for j in range ( len ( cs ) ) :
                hash = hash * 1000 + cs [ ( i + j ) % len ( cs ) ]
        self.ret += min ( self.ret , hash )
    def start ( self ) :
        with open ( os.devnull , 'w' ) as devnull :
            os.dup2 ( devnull.fileno ( ) , sys.stdin.fileno ( ) )
    def _tr ( self , * args ) :
        print ( [ str ( x ) for x in args ] )
    def _tr ( self , * args ) :
        return
    def _tr ( self , * args ) :
        cnt = 0
        originHash = hash ( args )
        for i in range ( len ( args ) ) :
            hash = 0
            for j in range ( len ( args ) ) :
                hash = hash * 1000 + args [ ( i + j ) % len ( args ) ]
                if hash == originHash :
                    cnt += 1
        return cnt
    def _tr ( self , * args ) :
        for i in range ( n ) :
            if hash ( args [ i ] ) in self.pending :
                self.pending [ hash ( args [ i ] ) ] = self.pending [ hash ( args [ i ] ) ] + 1
            else :
                self.pending [ hash ( args [ i ] ) ] = 1
    ans = 0
    for i in range ( n ) :
        for j in range ( len ( args ) ) :
            if hash ( args [ j ] ) not in self.pending :
                continue
            loop :
                for rotation in range ( 4 ) :
                    sum = 1
                    pending = { hash ( args [ j ] ) : 1 , hash ( args [ j ] ) : 2 if hash ( args [ j ] ) == hash ( args [ j ] ) else 0 }
                    for k in range ( 4 ) :
                    INDENT