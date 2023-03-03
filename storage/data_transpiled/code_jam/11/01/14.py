def _import ( ) : return [ ]
import os
import os
import os
import sys
import itertools
class InputFileParser ( object ) :
    def __init__ ( self , lines_per_case , file_name ) :
        self.lines_per_case = lines_per_case
        self.total_cases = 0
    def __iter__ ( self ) :
        self.lines_per_case = lines_per_case
        try :
            file_reader = open ( file_name , 'r' )
            self.reader = iter ( file_reader )
            line = self.reader.next ( )
            self.total_cases = int ( line )
        except StopIteration :
            raise Exception ( "No line found in file {}".format ( file_name ) )
    def __next__ ( self ) :
        try :
            return self.reader.next ( )
        except StopIteration :
            raise Exception ( "No line found in file {}".format ( file_name ) )
    def __iter__ ( self ) :
        return itertools.chain ( self.lines_per_case , self.total_cases )
    def next ( self ) :
        cases_extracted = [ ]
        for line in self.reader :
            cases_extracted.append ( next ( ) )
        cases_extracted.append ( cases_extracted )
        return cases_extracted
