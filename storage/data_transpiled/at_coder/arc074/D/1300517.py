def _import ( ) : return sys.stdin.read ( )
import os
import sys
import itertools
import string
import string
import string
import sys
import string
import string
import StringIO
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self , stream ) :
        stream = sys.stdin
        stream = sys.stdout
    def readline ( self ) :
        try :
            rl = stream.readline ( )
            if not rl :
                return
            self.next = next ( rl )
        except StopIteration :
            raise
        return self.next
    def solve ( self , test_number , stream , stream ) :
        height = self.next ( )
        width = self.next ( )
        s = [ ]
        sv = - 1
        tv = - 1
        for r in range ( height ) :
            s.append ( stream.read ( ).decode ( 'utf-8' ) )
            for c in range ( width ) :
                if s [ r ] [ c ] == 'S' :
                    sv = r * width + c
                if s [ r ] [ c ] == 'T' :
                    tv = r * width + c
        self.next = next ( iter ( s ) )
        q = [ ]
        d = [ ]
        p = [ ]
        infinity = 1000000000
        for ans in range ( height * width ) :
            [ nr , v ] = [ ]
            if s [ nr ] == '.' :
                continue
            u = nr * width + nc
            if d [ u ] > 1 + d [ v ] :
                d [ u ] = 1 + d [ v ]
                p [ u ] = v
                q.append ( u )
        if ans == 0 :
            return
        if ans == 1 :
            return
        if ans == 1 :
            return
