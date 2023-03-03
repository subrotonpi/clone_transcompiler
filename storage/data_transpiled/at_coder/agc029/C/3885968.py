def import _solve
import sys
import os
import sys
import json
import json
import json
import json
import json
import json
import json
import json
import json
import json
import json
import json
import json
import json
import json
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.a = json
    def set ( self ) :
        try :
            with open ( self.n ) as f :
                self.n = int ( f.read ( ) )
                self.a = json.loads ( f.read ( ) )
                self.s = json.loads ( f.read ( ) )
        except ValueError :
            pass
    def solve ( self ) :
        self.set ( )
        self.ng = 0
        ok = self.n
        while self.ok - self.ng > 1 :
            k = ( self.ng + self.ok ) // 2
            if is_possible ( k ) :
                ok = k
            else :
                self.ng = k
        print ( ok )
    def is_possible ( k ) :
        self.s = json.loads ( self.s )
        current = 0
        for ai in self.a :
            if ai <= current :
                if k == 1 :
                    return False
                while not self.s and self.s.lastkey >= ai :
                    self.s.pollLastEntry ( )
                p = ai - 1
                while True :
                    if p < 0 :
                        return False
                    sp = self.s.get ( p , 0 ) + 1
                    self.s [ p ] = sp
                    if sp == k :
                        self.s.pop ( p )
                        p -= 1
                    else :
                        break
            current = ai
        return True
