def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        self.odd = [ ]
        self.even = [ ]
        for i in range ( self.M ) :
            A = self.N - i
            if A % 2 == 0 :
                self.even.append ( A )
            else :
                self.odd.append ( A )
        if len ( self.odd ) > 2 :
            print ( "Impossible" )
        else :
            self.odd = [ ]
            if self.odd :
                self.odd.append ( self.odd [ 0 ] )
            self.even.extend ( self.even )
            if self.odd :
                self.odd.append ( self.odd [ 1 ] )
            self.printList ( self.odd )
            if len ( self.odd ) == 1 :
                if self.odd [ 0 ] > 1 :
                    self.odd [ 0 ] = self.odd [ 0 ] - 1
                    self.odd.append ( 1 )
            else :
                self.odd [ 0 ] = self.odd [ 0 ] - 1
                self.odd [ - 1 ] = self.odd [ - 1 ] - 1
                self.odd.insert ( 1 , 2 )
                if self.odd [ 0 ] == 0 :
                    self.odd.pop ( 0 )
                if self.odd [ - 1 ] == 0 :
                    self.odd.pop ( - 1 )
            print ( len ( self.odd ) )
            printList ( self.odd )
    def printList ( self ) :
        for i in range ( len ( self.odd ) ) :
            print ( self.odd [ i ] + ( self.odd [ i ] == self.odd [ i ] - 1 ) , end = '\n' )
