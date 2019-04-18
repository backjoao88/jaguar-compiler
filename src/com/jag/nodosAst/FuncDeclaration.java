
package com.jag.nodosAst;

public class FuncDeclaration {

	private String function;
	private FuncTypes funcTypes;
	private String identificador;
	private String abrirPar;
	private Parameters parametros;
	private String fecharPar;
	private String abrirBloco;
	private Blocks blocks;
	private ReturnBlock returnBlock;
	private String fecharBloco;

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public FuncTypes getFuncTypes() {
		return funcTypes;
	}

	public void setFuncTypes(FuncTypes funcTypes) {
		this.funcTypes = funcTypes;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getAbrirPar() {
		return abrirPar;
	}

	public void setAbrirPar(String abrirPar) {
		this.abrirPar = abrirPar;
	}

	public Parameters getParametros() {
		return parametros;
	}

	public void setParametros(Parameters parametros) {
		this.parametros = parametros;
	}

	public String getFecharPar() {
		return fecharPar;
	}

	public void setFecharPar(String fecharPar) {
		this.fecharPar = fecharPar;
	}

	public String getAbrirBloco() {
		return abrirBloco;
	}

	public void setAbrirBloco(String abrirBloco) {
		this.abrirBloco = abrirBloco;
	}

	public Blocks getBlocks() {
		return blocks;
	}

	public void setBlocks(Blocks blocks) {
		this.blocks = blocks;
	}

	public ReturnBlock getReturnBlock() {
		return returnBlock;
	}

	public void setReturnBlock(ReturnBlock returnBlock) {
		this.returnBlock = returnBlock;
	}

	public String getFecharBloco() {
		return fecharBloco;
	}

	public void setFecharBloco(String fecharBloco) {
		this.fecharBloco = fecharBloco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FuncDeclaration [function=");
		builder.append(function);
		builder.append(", funcTypes=");
		builder.append(funcTypes);
		builder.append(", identificador=");
		builder.append(identificador);
		builder.append(", abrirPar=");
		builder.append(abrirPar);
		builder.append(", parametros=");
		builder.append(parametros);
		builder.append(", fecharPar=");
		builder.append(fecharPar);
		builder.append(", abrirBloco=");
		builder.append(abrirBloco);
		builder.append(", blocks=");
		builder.append(blocks);
		builder.append(", returnBlock=");
		builder.append(returnBlock);
		builder.append(", fecharBloco=");
		builder.append(fecharBloco);
		builder.append("]");
		return builder.toString();
	}

}
