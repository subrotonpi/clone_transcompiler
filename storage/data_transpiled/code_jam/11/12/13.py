def _import ( ) : return [ ]
import os
import os
import sys
import os
import sys
import dict
class Round1AB ( object ) :
    def problemName = 'B'
    def inputName = 'large'
    def intParser ( c , i ) :
        global cost
        cost = c
        ind = i
    def rec ( args ) :
        inFilename = problemName + '-' + inputName + '.in'
        outFilename = problemName + '-' + inputName + '.out'
        print ( "Reading from " + inFilename )
        print ( "Writing to " + outFilename )
        sys.stdout.write ( inFilename + "\n" )
        ncases = len ( args )
        for i in range ( ncases ) :
            print ( "Running case " + str ( i + 1 ) + "..." )
            sys.stdout.write ( "Case #" + str ( i + 1 ) + ": " + handle_case ( ) )
        print ( "Done!" )
    def readline ( ) :
        global lastletter
        lastletter = 0
        for i in range ( 26 ) :
            lastletter = max ( lastletter , i )
        return lastletter
    def handle_case ( ) :
        n = len ( args )
        m = len ( args )
        words = [ ]
        strategies = [ ]
        for i in range ( m ) :
            words.append ( args [ i ] )
        for i in range ( n ) :
            strategies.append ( args [ i ] )
        return strategies
    def readline ( ) :
        global lastletter
        lastletter = 0
        for i in range ( 26 ) :
            lastletter = max ( lastletter , i )
        return lastletter
    def readline ( ) :
        global lastletter
        lastletter = 0
        for i in range ( n ) :
            lastletter = lastletter
        return lastletter
    def readline ( ) :
        global lastletter
        lastletter = 0
        for i in range ( 26 ) :
            lastletter = lastletter
        return [ ]
    def readline ( ) :
        global lastletter
        lastletter = lastletter
    return readline
