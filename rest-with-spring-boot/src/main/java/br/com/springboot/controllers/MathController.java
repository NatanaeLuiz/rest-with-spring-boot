package br.com.springboot.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.exceptions.UnsupportedMathOperationException;
import br.com.springboot.functions.FunctionsUtil;

@RestController
public class MathController {

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double soma(@PathVariable(value = "numberOne") String numberOne, 
					   @PathVariable(value = "numberTwo") String numberTwo
		) throws Exception{
		
		if (!FunctionsUtil.isNumeric(numberOne) || !FunctionsUtil.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Por favor, informe um valor numerico!");
		}
		return FunctionsUtil.convertToDouble(numberOne) + FunctionsUtil.convertToDouble(numberTwo);
		
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtracao(@PathVariable(value = "numberOne") String numberOne, 
					   @PathVariable(value = "numberTwo") String numberTwo
		) throws Exception{
		
		if (!FunctionsUtil.isNumeric(numberOne) || !FunctionsUtil.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Por favor, informe um valor numerico!");
		}
		return FunctionsUtil.convertToDouble(numberOne) - FunctionsUtil.convertToDouble(numberTwo);
		
	}
	
	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mult(@PathVariable(value = "numberOne") String numberOne, 
					   @PathVariable(value = "numberTwo") String numberTwo
		) throws Exception{
		
		if (!FunctionsUtil.isNumeric(numberOne) || !FunctionsUtil.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Por favor, informe um valor numerico!");
		}
		return FunctionsUtil.convertToDouble(numberOne) * FunctionsUtil.convertToDouble(numberTwo);
		
	}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable(value = "numberOne") String numberOne, 
					   @PathVariable(value = "numberTwo") String numberTwo
		) throws Exception{
		
		if (!FunctionsUtil.isNumeric(numberOne) || !FunctionsUtil.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Por favor, informe um valor numerico!");
		}
		return FunctionsUtil.convertToDouble(numberOne) / FunctionsUtil.convertToDouble(numberTwo);
		
	}
	
	//Media
	@RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double media(@PathVariable(value = "numberOne") String numberOne, 
					   @PathVariable(value = "numberTwo") String numberTwo
		) throws Exception{
		
		if (!FunctionsUtil.isNumeric(numberOne) || !FunctionsUtil.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Por favor, informe um valor numerico!");
		}
		return (FunctionsUtil.convertToDouble(numberOne) + FunctionsUtil.convertToDouble(numberTwo)) / 2;
		
	}
	
}
