def main ( args ) :
    import sys
    from optparse import OptionParser
    parser = OptionParser ( usage = usage )
    parser.add_option ( "-v" , "--verbose" , action = "count" , help = "Increment test verbosity (can be used multiple times)" )
    parser.add_option ( "-d" , "--debug" , action = "store_true" , help = "Print debugging items" )
    parser.add_option ( "-t" , "--token" , help = "Set token as the token for debugging purposes" )
    ( options , args ) = parser.parse_args ( args )
    for token in options.token :
        if token == "-" :
            print ( "" , end = "" )
        else :
            print ( token , end = "" )
    print ( )
