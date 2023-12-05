def import import input_stream
import sys
import os
import sys
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import os
import sys
class Main ( input_stream ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream = stream
        self.tokenize = tokenize
        self.next = tokenize
    def readline ( self ) :
        return next ( self.stream )
    def write ( self , stream ) :
        self.stream.write ( stream )
        self.stream.write ( stream )
    def readline ( self ) :
        return tokenize.next ( self.stream )
class TaskB ( object ) :
    def solve ( self , test_number , stream , readline ) :
        n = self.stream.tell ( )
        m = self.stream.tell ( )
        a = [ ]
        for _ in range ( n ) :
            a.append ( stream.read ( ) )
        ans = n
        used = [ False ] * m
        for _ in range ( m ) :
            cnt = [ ]
            for j in range ( n ) :
                idx = 0
                while used [ a [ j ] [ idx ] ] : idx += 1
                cnt [ a [ j ] [ idx ] ] += 1
            max = np.max ( cnt )
            ans = min ( ans , max )
            rmidx = np.argmax ( cnt )
            used [ rmidx ] = True
        return ans
    def readline ( self ) :
        while not self.stream.readline ( ) :
            try :
                s = tokenize.next ( self.stream )
            except StopIteration :
                break
            else :
                s = self.stream.readline ( )
        return s
    def readline ( self ) :
        while self.stream.readline ( ) :
            try :
                s = tokenize.next ( self.stream )
            except StopIteration :
                break
        return s
    def readline ( self ) :
        return tokenize.next ( self.stream )
