def _import ( ) : return sys.stdin.read ( )
import io
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import time
import time
import time
import random
import struct
class Main ( ) :
    def __init__ ( self , args ) :
        sc = readline
        n = sc.randint ( 0 , 1 )
        m = sc.randint ( 0 , 1 )
        edges = [ ]
        for i in range ( m ) :
            self.a = a
            self.b = b
            self.count = b
    def differ ( self , a ) :
        a = a
        self.count = b
        self.count = b
    def readline ( ) :
        return readline
    def readline ( ) :
        while not isinstance ( readline , str ) or readline.readline ( ).strip ( ) :
            readline.next = readline.next
        return readline
    def readline ( ) :
        return int ( readline ( ) )
    def q ( ) :
        persons = [ ]
        for i in range ( q ) :
            v = time.time ( ) - 1
            w = time.time ( )
            persons.append ( ( v , w , i ) )
        uf = UnionFind ( n )
        person = persons.pop ( )
        for edge in edges :
            while edge.year <= person.year :
                if not persons :
                    anss.append ( uf.count ( person.city ) )
                    person = persons.pop ( )
                else :
                    if not anss [ person.index ] :
                        anss [ person.index ] = uf.count ( person.city )
                    break
            uf.unite ( edge.origin , edge.destination )
        if not persons :
            persons.append ( person )
        while not persons :
            p = persons.pop ( )
            anss [ p.index ] = uf.count ( p.city )
        for i in range ( q ) :
            print ( anss [ i ] )
    return Main
    