def import _main
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.n = n
        self.zip = [ ]
        self.nbrs = [ ]
    def update ( self , visited , stack , x ) :
        self.stack.append ( x )
        self.nbrs.append ( x )
    def backtrack ( self , stack , x ) :
        while self.stack [ 0 ] != x :
            self.stack.pop ( )
    def start ( self ) :
        self.n = self.n
        for i in range ( 1 , self.n + 1 ) :
            self.zip [ i ] = self.stack [ i ]
            self.nbrs = [ ]
    def possible ( self , stack , x ) :
        while not self.queue.empty ( ) :
            self.stack.pop ( )
            self.nbrs.append ( self.stack [ i ] )
    def solve ( self ) :
        res = [ ]
        self.res_zips = [ ]
        self.visited = set ( )
        self.stack = [ ]
        x = self.start ( )
        self.update ( res , visited , stack , x )
        self.res_zips.append ( self.stack [ i ] )
        for i in range ( 1 , self.n ) :
            best_bt , best_nbr = - 1 , None
            best_zip = None
            stack_trial = self.stack [ i ]
            while len ( stack_trial ) >= 1 :
                bt = stack_trial.pop ( )
                for nbr in self.nbrs [ bt ] :
                    if nbr not in self.visited and ( best_zip is None or self.zip [ nbr ] < best_zip ) :
                        self.queue = self.stack [ i ]
                        self.stack.append ( nbr )
                        if self.possible ( self , set ( self.visited ) ) :
                            best_bt = bt
                            best_nbr = nbr
                            best_zip = self.stack [ i ]
            self.stack.append ( stack )
return Main
