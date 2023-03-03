def import _main
import sys
import os
import sys
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.m = 0
        self.ans = 0
        self.w = [ ]
        self.ww = [ ]
        self.visit = [ False ]
        self.visit = [ True ]
        self.dfs ( 0 )
        print ( self.ans )
        self.visit.append ( True )
    def dfs ( self ) :
        self.visit [ self.placenow ] = True
        success = True
        for i in range ( self.n ) :
            if self.visit [ i ] == False :
                success = False
                break
        if success :
            self.ans += 1
            self.visit [ self.placenow ] = False
            return
        for i in range ( self.m ) :
            if self.w [ i ] == self.placenow and self.visit [ self.ww [ i ] ] == False :
                self.dfs ( self.ww [ i ] )
            elif self.ww [ i ] == self.placenow and self.visit [ self.w [ i ] ] == False :
                self.dfs ( self.w [ i ] )
            else :
                continue
        self.visit [ self.placenow ] = False
        return
