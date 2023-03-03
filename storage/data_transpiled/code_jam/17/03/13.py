def _import ( ) : return
from StringIO import StringIO
from time import sleep
from itertools import chain , repeat
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from time import sleep
from time import time
from collections import deque
class C :
    def __init__ ( self , environ ) :
        self.environ = environ
        self.environ = environ
        self.iterations = sleep ( self.iterations )
    def solve ( self ) :
        n = randint ( 0 , self.iterations )
        k = randint ( 0 , self.iterations )
        q = deque ( [ ( n , 1 ) ] )
        while True :
            e = q.popleft ( )
            if e.count < k :
                k -= e.count
                if len ( e ) % 2 == 0 :
                    if not q and len ( q ) == len ( e ) / 2 :
                        q [ - 1 ].count += e.count
                    else :
                        q.append ( ( e [ 0 ] / 2 , e.count ) )
                    q.append ( ( e [ - 1 ] , e.count ) )
                else :
                    if not q and len ( q ) == len ( e ) / 2 :
                        q [ - 1 ].count += 2 * e.count
                    else :
                        q.append ( ( e [ - 1 ] , 2 * e.count ) )
            else :
                self.printcase ( )
                self.environ [ 'PATH' ] = self.environ [ 'PATH' ]
                break
    def printcase ( self ) :
        self.environ.pop ( 'PATH' , '' )
    def printlncase ( self ) :
        self.environ.pop ( 'PATH' , '' )
    def randint ( self ) :
        return int ( randint ( 0 , min ( len ( self.argv ) ) ) )
    def exit ( self ) :
        pass
