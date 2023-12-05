def _import ( ) :
    import os
    import sys
    import os
    import sys
    import subprocess
    import subprocess
    import subprocess
    class Robot ( subprocess.Popen ) :
        def run ( self ) :
            f = open ( sys.argv [ 1 ] )
            try :
                num_examples = int ( f.readline ( ) )
            except :
                num_examples = 0
            for i in range ( num_examples ) :
                problem = re.split ( '[, ]+' , f.readline ( ) )
                print ( 'Case #%d: %d: %s' % ( time , i + 1 , solve ( problem ) ) )
    def debug ( time , orange_robot , blue_robot ) :
        if False :
            print ( '@%d: %d -- %d' % ( time , orange_robot , blue_robot ) )
    def solve ( problem ) :
        blue_robot = 1
        orange_robot = 1
        orange_targets = [ ]
        blue_targets = [ ]
        is_next_target_blue = [ ]
        for i in range ( 1 , len ( problem ) , 2 ) :
            next_target_blue = problem [ i ].lower ( ) == 'b'
            is_next_target_blue.append ( next_target_blue )
            if next_target_blue :
                blue_targets.append ( int ( problem [ i + 1 ] ) )
            else :
                orange_targets.append ( int ( problem [ i + 1 ] ) )
        time = 0
        debug ( time , orange_robot , blue_robot )
        while not is_next_target_blue :
            next_target_blue = is_next_target_blue.pop ( )
            if next_target_blue :
                while blue_robot != orange_targets [ 0 ] :
                    time += 1
                    if blue_targets [ 0 ] > blue_robot :
                        blue_robot += 1
                    elif blue_targets [ 0 ] < orange_robot :
                        orange_robot -= 1
                debug ( time , orange_robot , blue_robot )
            time += 1
            blue_targets.append ( next_target_blue )
    return time
