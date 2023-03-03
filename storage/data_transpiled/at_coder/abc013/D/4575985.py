def import _main
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.amida = [ ]
    def __init__ ( self , * args ) :
        self.amida = [ ]
        for i in range ( 0 , self.amida.length ) :
            self.amida.append ( i )
        for i in range ( self.amida.length ) :
            self.swap ( self.amida )
    def attri ( self ) :
        self.amari = [ ]
        self.chikan = [ ]
        for i in range ( 0 , self.amida.length ) :
            self.attri.append ( - 1 )
            self.amari.append ( - 1 )
            self.chikan.append ( Vertex ( ) )
        counter = 0
        before = 0
        now = 0
        for i in range ( 1 , self.amida.length ) :
            if self.attri [ i ] == - 1 :
                self.attri.append ( counter )
                self.amari.append ( 0 )
                self.chikan [ counter ].append ( i )
                before = i
                now = self.amida [ i ]
                while self.amari [ now ] == - 1 :
                    self.amari [ now ] = self.amari [ before ] + 1
                    self.attri.append ( counter )
                    self.chikan [ counter ].append ( now )
                    before = now
                    now = self.amida [ before ]
                counter += 1
        goal = [ ]
        for i in range ( 1 , self.amida.length ) :
            zokusei = self.attri [ i ]
            vol = len ( self.chikan [ zokusei ] )
            amr = self.amari [ i ]
            goal.append ( self.chikan [ zokusei ] [ ( amr + D ) % vol ] )
        for i in range ( 1 , self.amida.length ) :
            print ( goal [ i ] )
    def swap ( self ) :
        a = self.amida [ i ]
        b = self.amida [ i + 1 ]
        self.amida [ i ] =