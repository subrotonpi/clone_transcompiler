def import import sys
class Energy ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.num_cases = self.num_cases
    for case_num in range ( 1 , num_cases + 1 ) :
        self.stdout.write ( 'Case #%d: ' % case_num )
        max_energy = sys.maxsize
        current_energy = max_energy
        regen = sys.maxsize
        num_events = self.num_events
        values = [ float ( x ) for x in sys.stdin ]
        cur_event = 0
        total_value = 0
        while cur_event != num_events :
            next_event = cur_event + 1
            while next_event != num_events and values [ next_event ] <= values [ cur_event ] :
                next_event += 1
            if next_event == num_events :
                total_value += values [ cur_event ] * current_energy
                current_energy = 0
            else :
                energy_to_leave = max ( max_energy - regen * ( next_event - cur_event ) , None )
                if energy_to_leave >= current_energy :
                    pass
                else :
                    energy_to_spend = current_energy - energy_to_leave
                    total_value += values [ cur_event ] * energy_to_spend
                    current_energy = energy_to_leave
            current_energy += regen
            current_energy = min ( current_energy , max_energy )
            cur_event += 1
        self.stdout.write ( '\n'.join ( [ str ( x ) for x in total_value ] ) )
    sys.stdout.write ( '\n' )
