def import myopen
import sys
import os
import getopt
class MyScanner ( object ) :
    def __init__ ( self ) :
        sc = myopen ( )
        a = sc.next ( )
        b = sc.next ( )
        if a == '' :
            a = ''
        else :
            a = a.split ( )
    def __init__ ( self ) :
        sc.next ( )
        la = len ( a )
        lb = len ( b )
        if la > lb :
            ans = 'GREATER'
        elif la < lb :
            ans = 'LESS'
        else :
            if a < b :
                ans = 'LESS'
            elif a > b :
                ans = 'GREATER'
            else :
                ans = 'EQUAL'
        print ( ans )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
class MyFile ( object ) :
    def __init__ ( self ) :
        self.stdin = open ( "" )
    def readline ( self ) :
        while not self.stdin or not self.stdin.readline ( ) :
            try :
                self.stdin.readline ( )
            except IOError :
                pass
        return self.stdin.readline ( )
    def randint ( self ) :
        return int ( self.stdin.readline ( ) )
    def long ( self ) :
        return long ( self.stdin.readline ( ) )
    def double ( self ) :
        return double ( self.stdin.readline ( ) )
    def readline ( self ) :
        data = ''
        try :
            data = open ( "" ).readline ( )
        except IOError :
            pass
        return data
