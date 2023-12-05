def import pygame.display
import pygame.display
class Main ( pygame.display.Surface ) :
    def __init__ ( self ) :
        pygame.display.set_mode ( ( 0 , 0 ) , pygame.OPENGL )
        self._dx , self._dy = [ 0 , 1 , 0 , - 1 ] , [ - 1 , 0 , 1 , 0 ]
    def __init__ ( self ) :
        pygame.display.set_mode ( ( 0 , 0 ) , pygame.OPENGL )
        self._h , self._w = self._h , self._w
        self.f = pygame.display.set_mode ( ( self._h , self._w ) , pygame.OPENGL )
        for i in range ( self._h ) : self.f [ i ] = pygame.display.set_mode ( ( self._w , self._w ) , pygame.OPENGL )
        start , end = None , None
        for i in range ( self._h ) :
            for j in range ( self._w ) :
                if self.f [ i ] [ j ] == 's' : start = ( j , i )
                if self.f [ i ] [ j ] == 'g' : end = ( j , i )
        g = pygame.display.Surface ( ( self._h , self._w ) , pygame.OPENGL )
        g [ start [ 1 ] ] = 3
        q = pygame.display.Queue ( )
        q.put ( start )
        while not q.empty ( ) :
            poll = q.get_nowait ( )
            for d in range ( 4 ) :
                y = poll [ 1 ] + self._dy [ d ]
                x = poll [ 0 ] + self._dx [ d ]
                if 0 <= y < self._h and 0 <= x < self._w :
                    if self.f [ y ] [ x ] == 'g' :
                        print ( 'YES' )
                        return
                    if self.f [ y ] [ x ] == '.' and g [ poll [ 1 ] ] [ poll [ 0 ] ] > g [ y ] [ x ] :
                        q.put ( ( x , y ) )
                        g [ y ] [ x ] = g [ poll [ 1 ] ] [ poll [ 0 ]