def import java.io io io
import sys
import os
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.__dict__ = { }
    def readline ( self ) :
        if self.__dict__.has_key ( '__iter__' ) :
            return
        else :
            return
    def __setitem__ ( self , key , value ) :
        self.__dict__ [ '__iter__' ] = key
    def run ( self ) :
        map = { }
        n = int ( self.__dict__ [ '__iter__' ] )
        for i in range ( n ) :
            key = self.__dict__ [ '__key__' ]
            if key in map :
                map [ key ] = map [ key ] + 1
            else :
                map [ key ] = 1
        m = int ( self.__dict__ [ '__m__' ] )
        for i in range ( m ) :
            key = self.__dict__ [ '__key__' ]
            if key in map :
                map [ key ] = map [ key ] - 1
            else :
                map [ key ] = - 1
        return map
