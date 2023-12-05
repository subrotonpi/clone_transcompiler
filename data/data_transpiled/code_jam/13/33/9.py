def _ _ import _ _ , SPACETOKEN C SPACETOKEN = SPACETOKEN C SPACETOKEN ) : SPACETOKEN pass STRNEWLINE SPACETOKEN """
import sys
class C :
    def check ( self , e ) :
        if not e :
            raise Error ( )
    class Attack :
        def __init__ ( self , n_tests = 1 ) :
            self.min = min
            self.max = max
            self.strength = strength
    class AttackList ( list ) :
        def __init__ ( self , * args ) :
            list.__init__ ( self , * args )
    def get_min ( self , height , min_i , max_i ) :
        self.check ( min_i <= max_i )
        min = sum ( [ min , max , i ] )
        for i in range ( min_i , max_i + 1 ) :
            min = min ( min , height [ i ] )
        return min
    def set_min ( self , height , min_i , max_i , min_height ) :
        self.check ( min_i <= max_i )
        for i in range ( min_i , max_i + 1 ) :
            height [ i ] = max ( height [ i ] )
    def solve_one ( self ) :
        days = [ ]
        n_trials = self.n_trials
        height = [ 401 ]
        base = 200
        for i_tribe in range ( n_trials ) :
            first_day = self.first_day
            n_attacks = self.n_trials
            first_min = self.first_min
            first_max = self.first_max
            first_strength = self.first_strength
            d_days = self.days [ : ]
            shift = self.shift
            d_strength = self.strength
            for i_attack in range ( n_attacks ) :
                day = first_day + i_attack * d_days
                min = first_min + i_attack * shift
                max = first_max + i_attack * shift
                strength = first_strength + i_attack * d_strength
                if not isinstance ( day , list ) :
                    day = day + 1
                days.append ( ( base + min , base + max - 1 , strength ) )
    count = 0
    for day in range ( len ( days ) ) :
        if days [ day ] == None :
            continue
        for attack in days [ day ] :
            if not isinstance ( attack , Attack ) :