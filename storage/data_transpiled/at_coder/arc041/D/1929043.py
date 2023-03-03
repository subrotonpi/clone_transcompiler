def _import ( ) : return [ ]
class Main ( object ) :
    def __init__ ( self , * args ) :
        self.g = [ ]
        self.n , self.m = args
        self.a , self.b , self.c = [ ] , [ ] , [ ]
        self.bfs ( self.v_start , self.color_start )
        q = [ self.n - 1 ]
        while self.pending :
            vc = self.next ( )
            v , color = vc // 2 , vc % 2
            if self.vis [ color ] [ v ] :
                continue
            self.vis [ color ] [ v ] = True
            if self.vis [ 1 - color ] [ v ] :
                self.remE = 0
                return
            for wc in self.g [ v ] :
                w , ind = int ( wc >> 32 ) , int ( wc )
                if self.used [ color ] [ ind ] :
                    continue
                if self.c [ ind ] == color :
                    self.used [ color ] [ ind ] = True
                    self.remE -= 1
                    self.q.append ( w * 2 + ( 1 - color ) )
    def solve ( self ) :
        self.used = [ False ] * 2
        self.vis = [ False ] * 2
        for i in range ( self.n ) :
            for b in range ( 2 ) :
                self.remE = self.m
                [ self.used [ 0 ] , self.used [ 1 ] , self.vis [ 0 ] , self.vis [ 1 ] , self.vis [ 1 ] , self.vis [ 1 ] , self.vis [ 2 ] , self.vis [ 2 ] , self.vis [ 2 ] , self.vis [ 2 ] , self.vis [ 3 ] , self.vis [ 3 ] , self.vis [ 3 ] , self.vis [ 4 ] , self.vis [ 5 ] , self.vis [ 6 ] , self.vis [ 7 ] , self.vis [ 6 ] , self.vis [ 7 ] , self.vis [ 8 ] , self.vis [ 9 ] , self.vis [ 8 ] , self.vis [ 9 ] , self.vis [ 8 ] , self.vis [ 9 ] , self.vis [ 10 ]