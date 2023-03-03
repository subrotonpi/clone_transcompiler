def _import ( ) : return [ ]
class Main ( ) :
    def __init__ ( self , g ) :
        self.g = [ ]
        self.n , self.m = self.n , self.m
        self.a , self.b , self.c = [ ] , [ ] , [ ]
        self._solve = 'Yes'
        self._solve = 'No'
    def bfs ( vstart , color_start ) :
        q = [ ]
        self.m = self.m
        self.a , self.b , self.c = [ ] , [ ] , [ ]
        self._solve = ''
        while self.pending or not self._solve :
            try :
                self._solve = ''
            except OSError :
                pass
        return self._solve
    def myopen ( self , f ) :
        while self.pending or not self._solve :
            vc = self._pending or self._pending or self._pending
            v , color = vc // 2 , vc % 2
            if self.vis [ color ] [ v ] :
                continue
            self.vis [ color ] [ v ] = True
            if self.vis [ 1 - color ] [ v ] :
                self._solve = ''
                return
            for wc in self.g [ v ] :
                w , ind = int ( wc >> 32 ) , int ( wc & 32 )
                if self.used [ color ] [ ind ] :
                    continue
                if self.c [ ind ] == color :
                    self.used [ color ] [ ind ] = True
                    self._solve -= 1
                    self._solve -= 1
                    self._solve = ''
        return self._solve
    def myopen ( self , f ) :
        f = open ( self._solve , 'w' )
        self.n , self.m = self.n , self.m
        self.a , self.b , self.c = [ ] , [ ] , [ ] , [ ]
        for i in range ( self.m ) :
            self.g [ i ].append ( ( self.a [ i ] << 32 ) | self.b [ i ] )
        self._solve = ''
        