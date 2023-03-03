def import _solve
import sys
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.dict = { }
        self.ans = 0
        self.keys = [ ]
    def __call__ ( self , W , idx , w_sum , v_sum ) :
        with open ( self.filename ) as f :
            N , W = f.read ( ).split ( )
            self.dict = { }
            for w , v in zip ( self.dict , W ) :
                if w not in self.dict :
                    v = [ v ]
                    self.dict [ w ] = v
                else :
                    self.dict [ w ].append ( v )
        self.keys = [ key for key in self.dict.keys ( ) ]
        idx = 0
        for key in self.dict.keys ( ) :
            keys.append ( key )
        self.dict.keys ( ).sort ( reverse = True )
        self.solve ( W , 0 , 0 , None )
        print ( self.ans )
    def solve ( self , W , idx , w_sum , v_sum ) :
        if idx == len ( self.keys ) :
            self.ans = max ( self.ans , v_sum )
        else :
            self.solve ( W , idx + 1 , w_sum , v_sum )
            for v in self.dict [ self.keys [ idx ] ] :
                if self.W - w_sum < self.keys [ idx ] :
                    return
                w_sum += self.keys [ idx ]
                v_sum += int ( v )
                self.solve ( W , idx + 1 , w_sum , v_sum )
return Main
