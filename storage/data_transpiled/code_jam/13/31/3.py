def import import is_vowel , StringIO
import os
import sys
class A ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.out = StringIO ( )
    def is_vowel ( self , ch ) :
        return ch in "aeiou"
    def solve ( self ) :
        tests = self.count ( )
        for testcase in range ( 1 , tests + 1 ) :
            s = self.f.read ( )
            n = self.n
            answer = last = - 1
            rle = 0
            for i in s :
                is_cons = not is_vowel ( i )
                if is_cons :
                    rle += 1
                else :
                    rle = 0
                if rle >= n :
                    last = i
                if last != - 1 :
                    answer += ( long ( last - n + 2 ) )
            print ( "Case #%d: %s" % ( testcase , answer ) )
    def run ( self ) :
        try :
            self.f = open ( "A-large.in" , "r" )
            self.out = open ( "a-large.out" , "w" )
            self.solve ( )
            self.out.close ( )
        except IOError :
            pass
    class FastScanner ( object ) :
        def __init__ ( self , f ) :
            self.f = open ( "A-large.in" , "r" )
            self.f = open ( "a-large.out" , "w" )
            self.solve ( )
            self.f.close ( )
    class A ( object ) :
        def __init__ ( self , f ) :
            self.f = open ( "A-large.in" , "r" )
            self.f = open ( "a-large.out" , "w" )
            self.f = open ( "a-large.out" , "w" )
            self.solve ( )
            self.f.close ( )
