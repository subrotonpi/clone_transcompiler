def _ import _ , os , sys , os , sys , _ ) :
    import os , sys
    from os import urandom
    import random
    import locale
    import tokenize
    class Solution ( object ) :
        def __init__ ( self ) :
            self.stdin = open ( 'data.in' , 'r' )
            self.stdout = open ( 'data.out' , 'w' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
        def readline ( self ) :
            while not self.stdout.readline ( ) :
                return
            self.stdout.readline ( )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
            self.stdout.write ( '\n' )
    def go ( self , i , depend , answer , current , used ) :
        if answer [ i ] != - 1 :
            return current
        if used [ i ] :
            print ( 'Botva!' )
        used [ i ] = True
        for j in range ( len ( depend [ i ] ) ) :
            if depend [ i ] [ j ] :
                current = go ( j , depend , answer , current , used )
        answer [ i ] = current
        current += 1
        return current
    def solve ( self ) :
        t = randint ( 1 , t + 1 )
        