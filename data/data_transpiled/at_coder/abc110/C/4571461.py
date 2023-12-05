def import _dict_dict
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.S = sys.stdin.read ( )
        self.T = sys.stdin.read ( )
    def __init__ ( self , S , T ) :
        self.S = S
        self.T = T
        self.dict_s = { }
        self.dict_t = { }
        self.index = 0
        for char_s , char_t in zip ( S , T ) :
            if char_s in self.dict_s :
                if char_t in self.dict_t :
                    if not self.dict_s [ char_s ] == self.dict_t [ char_t ] :
                        self.print ( 'No' )
                        return
                else :
                    self.print ( 'No' )
                    return
            else :
                if self.dict_t [ char_t ] == self.dict_t [ char_t ] :
                    self.print ( 'No' )
                    return
            self.index += 1
            self.dict_s [ char_s ] = self.index
            self.dict_t [ char_t ] = self.index
        self.print ( 'Yes' )
