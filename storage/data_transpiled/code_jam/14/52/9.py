def _import ( ) :
    import os , subprocess , subprocess
    from multiprocessing import Pool , cpu_count
    class B :
        def __init__ ( self ) :
            self.p , self.q , self.n = 0 , 0 , 0
            self.p , self.q , self.n = self.p , self.q , self.n
            self.hp = [ ]
            self.gold = [ ]
            for case in self.test_cases :
                self.stdout.write ( 'Case #%d: ' % ( case + 1 ) )
                self.stdout.flush ( )
        def solve ( self ) :
            self.max_turns = 0
            for h in self.hp :
                self.max_turns += ( h + self.q - 1 ) // self.q
            self.max_turns += 10
            dp = [ ]
            for d in self.dp :
                [ d ] = self.dp [ d ]
            dp [ 0 ] [ 1 ] = 0
            for killed in self.n :
                for west_have_turns in self.max_turns :
                    if self.dp [ killed ] [ west_have_turns ] == int ( self.dp [ killed ] [ west_have_turns ] ) :
                        continue
                    man = self.hp [ killed ]
                    hits = ( man + self.q - 1 ) // self.q
                    for tower_hits_man in self.hits :
                        west_hit_to_kill = ( man - self.q * self.tower_hits_man + self.p - 1 ) // self.p
                        if self.tower_hits_man + west_hit_to_kill < self.west_hit_to_kill :
                            continue
                        west_now_have_turns = west_have_turns + self.tower_hits_man - west_hit_to_kill
                        self.dp [ killed + 1 ] [ west_now_have_turns ] = max ( self.dp [ killed + 1 ] [ west_now_have_turns ] , self.dp [ killed + 1 ] [ west_hit_to_kill ] + self.gold [ killed ] )
    B.solve ( )
